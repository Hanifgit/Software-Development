<template>
<h4>------------------------------------------------------------------------------------------------------------------------------------</h4>

<h4>Reuse Component</h4>
<ul>
    <li v-for="item in users" :key="item.name">
        <!-- {{ item.name }} ---  {{ item.email }} -->
        <child :data="item" :getdata="getdata"/>
    </li>
</ul>

</template>

<script>
import Child from './Child_Reuse'
export default {
    name: "reuse",
    components: {
        Child
    },
    methods:{
        getdata(name){
            alert(name)
        }
    },
    data() {
        return {
            users: [{
                name:'papon',
                email:'papon@gmail.com'
            },{
                name:'karim',
                email:'karim@gmail.com'
            },{
                name:'rahim',
                email:'rahim@gmail.com'
            }]
        }
    },
    
}
</script>

<style scoped>

</style>
