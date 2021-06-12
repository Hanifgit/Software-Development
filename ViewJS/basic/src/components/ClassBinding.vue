<template>
<h4>------------------------------------------------------------------------------------------------------------------------------------</h4>

<h4>Class Binding</h4>
<h4 :class="{green:true,red:true}">Class Binding 1</h4>
<h4 :class="{green:colorful}">Class Binding 2</h4>
<h4 :class="adjustStyle">Class Binding 3</h4>
<button v-on:click="colorful=!colorful">Apply Style</button>
</template>

<script>
export default {
    name: "classbinding",
    data() {
        return {
            colorful: true
        }
    },
    computed: {
        adjustStyle() {
            return {
                green: this.colorful,
                red: true,
                size:true
            }
        }
    }
}
</script>

<style scoped>
h4 {
    color: green;
}

.green {
    background-color: green;
    width: 200px;
    padding: 10px;
    color: #ffff;
}

.red {
    color: rgb(255, 0, 0);
}
.size{
    font-size: 15px;
}
</style>
