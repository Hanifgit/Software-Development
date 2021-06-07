<template>
<h4>Slots</h4>
<child>
    <h4>Hello EveryOne,</h4>

    <h4>I am Rakibul Ahasan Papon</h4>

    <img src="https://upload.wikimedia.org/wikipedia/commons/b/b6/Image_created_with_a_mobile_phone.png" width="100" height="100">


<!-- Multiple slots with Named Slot -->

    <template v-slot:header>
        <h4>header Slot</h4>
    </template>
    <template v-slot:main>
        <h4>main Slot</h4>
    </template>
    <template v-slot:footer>
        <h4>footer Slot</h4>
    </template>
    
</child>
</template>

<script>
import Child from './Child_Slots.vue'
export default {
    name: "slots",
    components: {
        Child
    }

}
</script>

<style scoped>

</style>
