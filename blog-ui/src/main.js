
import { createApp } from 'vue'
import {createPinia} from 'pinia'
import axios from 'axios'

import App from './App.vue'
import router from './router'

const app = createApp(App)

app.use(createPinia())
app.use(router)

app.mount('#app')

// axios.defaults.baseURL='127.0.0.1:8091';
// axios.defaults.baseURL='';
app.config.globalProperties.$axios = axios;
