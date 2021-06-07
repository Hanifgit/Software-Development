<template>
<slot></slot>

<!-- Multiple slots with Named Slot -->
<div class="cart">
    <header>
        <slot name="header"></slot>
    </header>
    <content>
        <slot name="main"></slot>
    </content>
    <footer>
        <slot name="footer"></slot>
    </footer>
</div>
</template>

<script>
export default {
    name: "child",
    props: {

    }
}
</script>

<style>
.cart {
    border: 5px solid;
    border-color: rgb(211, 160, 32);
    width: 130px;
    padding: 20px;
    text-align: center;
}
</style>
