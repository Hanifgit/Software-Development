<template>
<h4>------------------------------------------------------------------------------------------------------------------------------------</h4>

   <h4>Conditions in Vue Js</h4> 
   <h4 v-if="show">React</h4> 
   <h4 v-else>VueJs</h4> 
   <button v-on:click="show=true">Hide VueJs</button>
   <button v-on:click="show=!show">Vice Versa</button>
</template>

<script>
export default {
    name : "ifelse",
    data() {
        return {
            show:false //show is true show 'React'
        }
    },
}
</script>

<style scoped>
h4{
    color: orange;
}
</style>