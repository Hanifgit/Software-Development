<template>
<h4>Teleport Component</h4>
<teleport to="#footer">
    <footer-vue />
</teleport>
</template>

<script>
import FooterVue from './Footer.vue'

export default {
    name: "teleport",
    components: {
        FooterVue
    },
    data() {
        return {

        }
    },
}
</script>

<style scoped>
h4 {
    color: orange;
}
</style>
