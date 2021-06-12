<template>
<h4>------------------------------------------------------------------------------------------------------------------------------------</h4>

<h4>Pass Data Parent To Child</h4>
<child name="Come in Parent To Child" :age="age" :username="user.name" :useremail="user.email" :fun="getData" />
</template>

<script>
import Child from './Child_PtoC.vue'
export default {
    name: "Parent",
    components: {
        Child
    },
    data() {
        return {
            age: 24,
            user: {
                name:'papon',
                email:'acw@gmail.com'
            }
        }
    },
    methods: {
        getData(){
            alert("Function calling")
        }
    },
}
</script>

<style scoped>
h4 {
    color: rgb(64, 145, 145);
}
</style>
