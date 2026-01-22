import { createRouter, createWebHistory } from 'vue-router'
import Login from '../views/Login.vue'
import Dashboard from '../views/Dashboard.vue'
import Tasks from '../views/Tasks.vue'

const routes = [
  { path: '/', component: Login },
  { path: '/dashboard', component: Dashboard },
  { path: '/tasks', component: Tasks },
]

export const router = createRouter({
  history: createWebHistory(),
  routes,
})
