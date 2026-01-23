<template>
  <div>
    <h2>Tasks</h2>
    <ul>
      <li v-for="task in tasks" :key="task.id">{{ task.title }} - {{ task.status }}</li>
    </ul>
  </div>
</template>

<script setup lang="ts">
import { ref, onMounted } from 'vue'
import api from '../services/api'

const tasks = ref([])

onMounted(async () => {
  const res = await api.get('/tasks')
  tasks.value = res.data
})
</script>
