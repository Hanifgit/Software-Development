<template>
<h4>Dynamic Component</h4>
<button @click="tab='JavaVue'">Java</button>
<button @click="tab='NodeVue'">Node</button>
<button @click="tab='PhpVue'">Php</button>
<component :is="tab"/>

</template>

<script>
import JavaVue from './Java.vue'
import NodeVue from './Node.vue'
import PhpVue from './Php.vue'

export default {
    name: "language",
    components: {
        JavaVue,
        NodeVue,
        PhpVue
    },
    data(){
        return{
            tab:'JavaVue'
        }
    }
}
</script>

<style scoped>

</style>
