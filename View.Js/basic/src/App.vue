<template>
<img height="100" alt="Vue logo" src="./assets/logo.png">
<HelloWorld msg="Welcome to Your Vue.js App" />
<make-component />
<interpolation-data />
<methods-params />
<events />
<two-way-binding />
<IFElse />
<for-loop />
<pass-data-p-to-c />
<reuse />
<html-binding/>
<class-binding/>
<pass-data-c-to-p/>
<refs-vue/>
<form-vue/>
<watchers-vue/>
<slots-vue/>
<dynamicComponent/>
<teleport-vue/>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue'
import MakeComponent from './components/MakeComponent.vue'
import InterpolationData from './components/InterpolationData.vue'
import MethodsParams from './components/MethodsParams.vue'
import Events from './components/Events.vue'
import TwoWayBinding from './components/TwoWayBinding.vue'
import IFElse from './components/IFElse.vue'
import ForLoop from './components/ForLoop.vue'
import PassDataPToC from './components/Pasa_Data_Parent_To_Child/PassDataParentToChild.vue'
import Reuse from './components/Reuse/ReuseComponent.vue'
import htmlBinding from './components/HTMLBinding.vue'
import classBinding from './components/ClassBinding.vue'
import PassDataCToP from './components/Pasa_Data_Child_To_Parent/PassDataChildToParent.vue'
import RefsVue from './components/Refs.vue'
import FormVue from './components/Form.vue'
import WatchersVue from './components/Watchers.vue'
import SlotsVue from './components/Solots/Slots.vue'
import dynamicComponent from './components/Dynamic_Component/Language'
import TeleportVue from './components/Teleport_Component/Teleport.vue'

export default {
    name: 'App',
    components: {
        HelloWorld,
        MakeComponent,
        InterpolationData,
        MethodsParams,
        Events,
        TwoWayBinding,
        IFElse,
        ForLoop,
        PassDataPToC,
        Reuse,
        htmlBinding,
        classBinding,
        PassDataCToP,
        RefsVue,
        FormVue,
        WatchersVue,
        SlotsVue,
        dynamicComponent,
        TeleportVue
    }
}
</script>

<style>
#app {
    font-family: Avenir, Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    /* text-align: center; */
    margin-left: 50px;
    color: #2c3e50;
    margin-top: 60px;
}
</style>
