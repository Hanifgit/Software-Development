<template>
<h4>------------------------------------------------------------------------------------------------------------------------------------</h4>
<h4>Two Way Binding</h4>
<input type="text" placeholder="Enter Name" v-model="name"><br><br>

<input type="text" placeholder="Enter Email" v-model="email"><br><br>
<input type="password" placeholder="Enter Password" v-model="password"><br><br>
<button type="button" v-on:click="getdata()">Get Data</button>
<h1>{{name}} {{email}} {{passwod}}</h1>

<label for="java">Java</label>
<input type="checkbox" value="java" id="java" v-model="technology">
<label for="php">Php</label>
<input type="checkbox" value="php" id="php" v-model="technology">
<label for="c++">C++</label>
<input type="checkbox" value="c++" id="c++" v-model="technology"><br><br>
<h4>technology: {{technology}}</h4>

<label for="male">Male</label>
<input type="radio" value="male" id="male" v-model="gender">
<label for="female">Female</label>
<input type="radio" value="female" id="female" v-model="gender"><br><br>
<h4>technology: {{gender}}</h4>
</template>

<script>
export default {
    name: "dataBinding",
    data() {
        return {
            name: null,
            email: null,
            password: null,
            technology:[],
            gender:null,
        }
    },
    methods: {
        getdata() {
            alert(this.email, this.password)
        }
    },
}
</script>

<style scoped>
h4,
input,
button {
    color: rgb(19, 36, 83);
}
</style>
