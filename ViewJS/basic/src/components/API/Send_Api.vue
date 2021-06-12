<template>
<h4>------------------------------------------------------------------------------------------------------------------------------------</h4>
<h4>Send API</h4>
<input type="text" name="email" v-model="email" id=""><br><br>
<input type="text" name="password" v-model="password" id=""><br><br>
<button v-on:click="addUser()">Add New User</button>

</template>

<script>
import axios from "axios"
export default {
    name: 'api',
    data(){
        return{
            email:'',
            password:''
        }
    },
    methods:{
        async addUser(){
            let result = await axios.post("https://reqres.in/api/users?page=1",{
                email:this.email,
                password:this.password
            });
            console.warn(result)
        }
    },
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->

<style scoped>
.item{
    display: flex;
}
.item img{
    width: 50px;
}
.item li{
    display: inline-block;
    border: 1px solid;
    width: 180px;
    text-align: center;
    padding: 5px;
}
</style>
