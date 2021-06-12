<template>
<div class="hello">
    <h4>{{ name }}</h4>
    <h4>{{ age }}</h4>
    <h4>{{ username }}</h4>
    <h4>{{ useremail }}</h4>           
    <button v-on:click="fun()">Function Call</button>
</div>
</template>

<script>
export default {
    name: 'child',
    props: {
        name: String,
        age: String,
        username: Object,
        useremail:Object,
        fun: Function,
    }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->

<style scoped>
h4,button{
    color: rgb(64, 145, 145);
}
</style>
