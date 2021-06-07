<template>
<h4>Simple Form</h4>
<ul>
    <li v-for="item in error" v-bind:key="item">
        {{ item }} is Invalid
    </li>
</ul>
<p>{{form}}</p>

<form>
    <label for="email">Email: </label>
    <input type="text" placeholder="Enter Email" v-model="form.email"><br><br>
    <label for="password">Password: </label>
    <input type="password" placeholder="Enter Password" v-model="form.password"><br><br>

    <label for="">Choose a country: </label>
    <select v-model="form.country">
        <option>Bangladesh</option>
        <option>Pakistan</option>
    </select><br><br>

    <h4>Gender: </h4>
    <label for="male">Male:</label>
    <input type="radio" name="gender" value="male" v-model="form.gender">
    <label for="female">Female:</label>
    <input type="radio" name="gender" value="female" v-model="form.gender"><br><br>

    <h4>Technology: </h4>
    <label for="java">Java:</label>
    <input type="checkbox" value="java" v-model="form. technology">
    <label for="python">Python:</label>
    <input type="checkbox" value="python" v-model="form. technology"><br><br>

    <button type="button" v-on:click="login">Login</button>
</form>
</template>

<script>
export default {
    name: "form",
    data() {
        return {
            form: {
                email: '',
                password: '',
                country: '',
                gender: '',
                technology: []
            },
            error: []
        }
    },
    methods: {
        login() {
            console.warn(this.form)
            this.error = []
            for (const item in this.form) {
                if (this.form[item] === "" || this.form[item].length == 0) {
                    this.error.push(item)
                }
            }
            if (this.error.length === 0) {
                alert("Data has been submitted")
            }
            console.warn(this.error)
        }
    }
}
</script>

<style scoped>

</style>
