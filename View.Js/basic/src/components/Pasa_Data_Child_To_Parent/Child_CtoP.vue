<template>
    <button v-on:click="fundata(name)">Child Button</button>
</template>

<script>
export default {
    name:"child",
    props:{
       fundata:Function
    },
    data(){
        return{
            name : "Papon"
        }
    }
}
</script>

<style scoped>

</style>