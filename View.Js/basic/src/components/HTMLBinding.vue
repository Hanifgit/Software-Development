<template>
<h4>{{ taxt }}</h4>
<div class="tag" v-html="tag1 + tag2 + tag3"></div>
</template>

<script>
export default {
    name: "html_binding",
    data() {
        return {
            taxt: "Html Binding",
            tag1: "<h4>HTML TAG1</h4>",
            tag2: "<h4>HTML TAG2</h4>",
            tag3: "<h4>HTML TAG2</h4>"
        }
    }
}
</script>

<style scoped>
h4 {
    color: chocolate;
}

.tag {
    color: chocolate;
}
</style>
