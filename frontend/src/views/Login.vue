<template>
  <div>
    <h2>Login</h2>
    <form @submit.prevent="loginUser">
      <input v-model="username" placeholder="Username" />
      <select v-model="role">
        <option>ROLE_ADMIN</option>
        <option>ROLE_MANAGER</option>
        <option>ROLE_USER</option>
      </select>
      <button type="submit">Login</button>
    </form>
  </div>
</template>

<script setup lang="ts">
import { ref } from 'vue'
import api from '../services/api'
import { useAuthStore } from '../store/auth'
import { useRouter } from 'vue-router'

const username = ref('')
const role = ref('ROLE_USER')
const authStore = useAuthStore()
const router = useRouter()

const loginUser = async () => {
  const res = await api.post('/auth/login', null, { params: { username: username.value, role: role.value } })
  authStore.login(res.data.token, role.value)
  router.push('/dashboard')
}
</script>
