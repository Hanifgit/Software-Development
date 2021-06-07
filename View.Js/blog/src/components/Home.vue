<template>
<h1>Home Componenet {{10+10}}</h1>
<h1>Name : {{getName()}} {{getLastName()}}</h1>
<h1>Email : {{email}}</h1>
<h1>Age : {{getAge(24)}}</h1>
<h1>Phone : {{phone=5987}}</h1>
</template>

<script>
export default{
    name : "Home",
    data() {
        return {
            email:"ahasan.papon@gmail.com",
            getName(){
                return "Papon"
            },
            getAge(age){
                return age
            }
        }
    },
    methods:{
        getLastName(){
            return "Ahasan"
        }
    }
}
</script>

<style scoped>
h1{
    color: rgb(24, 83, 19);
}
</style>