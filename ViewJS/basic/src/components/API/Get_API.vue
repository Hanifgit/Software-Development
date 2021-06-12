<template>
<h4>------------------------------------------------------------------------------------------------------------------------------------</h4>
<h4>Call API</h4>
<ul class="item" v-for="item in list" :key="item.id">
    <li>{{item.id}}</li>
    <li>{{item.email}}</li>
    <li>{{item.first_name}}</li>
    <li><img :src="item.avatar" alt=""></li>
</ul>

</template>

<script>
import axios from "axios"
export default {
    name: 'api',
    data(){
        return{
            list:[]
        }
    },
    async mounted(){
        let result = await axios.get("https://reqres.in/api/users?page=1");
        console.log(result.data.data);
        this.list = result.data.data;
    }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->

<style scoped>
.item{
    display: flex;
}
.item img{
    width: 50px;
}
.item li{
    display: inline-block;
    border: 1px solid;
    width: 180px;
    text-align: center;
    padding: 5px;
}
</style>
