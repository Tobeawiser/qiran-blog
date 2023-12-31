import {createApp} from 'vue'
import {createPinia} from 'pinia'
import axios from 'axios'

import App from './App.vue'
import router from './router'
import ViewUIPlus from 'view-ui-plus'
import 'view-ui-plus/dist/styles/viewuiplus.css'

const app = createApp(App)

app.use(createPinia())
app.use(router)
app.use(ViewUIPlus)

app.mount('#app')



app.config.globalProperties.$axios = axios;
