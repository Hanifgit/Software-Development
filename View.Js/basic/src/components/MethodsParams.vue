<template>
<h4>Methods</h4>
<h4>Name : {{getLastName()}}</h4>
<h4>Age : {{getAge('24')}}</h4>
<h4>Intro : {{getIntro().name}} {{getIntro().age}}</h4>
</template>

<script>
export default {
    name : 'Methods',
    data(){
        return{
             year : '25'
        }
    },
    methods: {
        getLastName() {
            return "Ahasan"
        },
        getAge(age) {
            return age
        },
        getIntro(){
            return{
                name : "Papon",
                age : this.year
            }
        }
    }
}
</script>

<style scoped>
h4 {
    color: rgb(65, 19, 83);
}
</style>
