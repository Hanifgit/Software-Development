<template>
<h4>For Loop</h4>
<ul>
    <li v-for="item in technology" :key="item">
        {{ item }}
    </li>
</ul>
<ul>
    <li v-for="item in users" :key="item.name">
       User is :  {{ item.name }} : {{ item.email }}
    </li>
</ul>
</template>

<script>
export default {
    name: "forloop",
    data() {
        return {
            technology: [
                "html",
                "css",
                "javascript",
                "laravel",
                'vuejs'
            ],
            users: [{
                name: "papon",
                email: "anc@gmail.com"
            }, {
                name: "karim",
                email: "aas@gmail.com"
            }, {
                name: "rahim",
                email: "asd@gmail.com"
            }],
        }
    },
}
</script>

<style scoped>
h4,
ul {
    color: rgb(84, 49, 116);
}
</style>
