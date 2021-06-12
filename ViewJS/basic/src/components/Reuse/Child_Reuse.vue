<template>
<!-- <h4>Come in Reuse Component</h4> -->
<div class="user">
    <h4>{{data.name}}</h4>
    <h4>{{data.email}}</h4>
    <button v-on:click="getdata(data.name)">Button</button>
</div>
</template>

<script>
export default {
    name: "child",
    props: {
        data: Object,
        getdata: Function,
    },
    data() {
        return {
            users: [{
                name: 'xyz',
                email: 'xyz@gmail.com'
            }, {
                name: 'abc',
                email: 'abc@gmail.com'
            }, {
                name: 'ijk',
                email: 'ijk@gmail.com'
            }]
        }
    },
}
</script>

<style scoped>
.user {

    background-color: skyblue;
    border-bottom: 1px solid;
    padding: 10px;
    margin-bottom: 15px;

}
</style>
