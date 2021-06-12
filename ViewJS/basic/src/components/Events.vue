<template>
<h4>------------------------------------------------------------------------------------------------------------------------------------</h4>

<h4>Events</h4>
<h4>{{count}}</h4>
<button v-on:click="getInc()">Click Me</button>
<button v-on:click="getData()">Click Me</button>
<button v-on:click="getClick('click button')">Click Me</button>
<button v-on:dblclick="getClick('click double button')">Click Me</button>
<button v-on:mousemove="getClick('mouse move button')">Click Me</button>
</template>

<script>
export default {
    name: "events",
    data() {
        return {
            count: 0
        }
    },
    methods: {
        getData() {
            alert("Hello World")
        },
        getClick(data) {
            alert(data)
        },
        getInc() {
            this.count += 1
        }
    },
}
</script>

<style scoped>
h4,
button {
    color: brown;
}
</style>
