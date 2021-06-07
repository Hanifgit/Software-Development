<template>
<h4>Watchers</h4>
<h4>{{count}}</h4>
<button v-on:click="count+=1"> + </button>
<button v-on:click="count-=1"> - </button>
</template>

<script>
export default {
    name: "watchers",
    data() {
        return {
            count: 0
        }
    },
    watch: {
        count(val, prev) {
            if (val > 5 && val > prev) {
                alert("stop counting");
                this.count=0
            }
        }
    }

}
</script>

<style scoped>
h4,
button {
    color: chartreuse;
}
</style>
