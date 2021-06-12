<template>
<h4>------------------------------------------------------------------------------------------------------------------------------------</h4>

<h4>Interpolation Data :</h4>
<h4>Home Componenet {{10+10}}</h4>
<h4>Name : {{getName()}} {{getLastName()}}</h4>
<h4>Email : {{email}}</h4>
<h4>Age : {{getAge(24)}}</h4>
<h4>Phone : {{phone=5987}}</h4>
</template>

<script>
export default {
    name: "InterpolationData",
    data() {
        return {
            email: "ahasan.papon@gmail.com",
            getName() {
                return "Papon"
            },
            getAge(age) {
                return age
            }
        }
    },
    methods: {
        getLastName() {
            return "Ahasan"
        }
    }
}
</script>

<style scoped>
h4 {
    color: rgb(24, 83, 19);
}
</style>
