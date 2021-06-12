import { createWebHistory, createRouter } from "vue-router";
import Home from "@/components/Home.vue";
import About from "@/components/About.vue";
import NotFound from "@/components/Notfound.vue";

const routes = [{
        path: "/",
        name: "Home",
        component: Home,
    },
    {
        path: "/about/:name",
        name: "About",
        component: About,
    },
    {
        path: "/:pathMatch(.*)*",
        name: 'NotFound',
        component: NotFound,
    }
];

const router = createRouter({
    history: createWebHistory(),
    routes,
});

export default router;