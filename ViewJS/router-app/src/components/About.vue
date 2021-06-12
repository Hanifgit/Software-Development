<template>
  <h1>{{about}}'s About Page</h1>
</template>

<script>
import {useRoute} from 'vue-router';
export default {
  name: "About",
  data(){
    return{
      about:''
    }
  },
  mounted(){
    const route=useRoute();
    console.warn("route",route.params.name);
    this.about=route.params.name;
  }
}
</script>

<style scoped>

</style>