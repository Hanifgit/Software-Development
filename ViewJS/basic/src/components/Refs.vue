<template>
<h4>------------------------------------------------------------------------------------------------------------------------------------</h4>

<h4>Ref in VueJs</h4>
<input type="text" ref="input">
<button v-on:click="getData">Click Me</button>
</template>

<script>
export default {
    name: "refs",
    methods: {
        getData() {
            this.$refs.input.focus();
            this.$refs.input.value = "Refs Input";
            this.$refs.input.style.color = "orange"
        }
    }
}
</script>

<style scoped>
h4,
button {
    color: orange;
}
</style>
