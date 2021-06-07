<template>
    <h4>Pass Data Child To Parent</h4>
    <h4>User Name : {{name}}</h4>
    <child :fundata="getuser"/>
</template>

<script>
import child from './Child_CtoP.vue'
export default {
    name:"Parent",
    components:{
       child
    },
    data(){
        return{
            name:null
        }
    },
    methods:{
        getuser(name){
            this.name = name
        }
    }
    
}
</script>

<style scoped>

</style>