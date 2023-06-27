import {fileURLToPath, URL} from 'node:url'

import {defineConfig} from 'vite'
import vue from '@vitejs/plugin-vue'

// https://vitejs.dev/config/
// module.exports = {
//   devServer: {
//     port: 8089, // �޸�Ϊ����Ҫ�Ķ˿ں�
//     	//����axios
//     proxy: 'http://localhost:8091',
//   }
// }

export default defineConfig({
    plugins: [
        vue(),
    ],
    server: {
        port: 8089, // �޸�Ϊ����Ҫ�Ķ˿ں�
        //����axios
        proxy: {
            '/article': {
                target: '127.0.0.1:8091',
                rewrite: (path) => path.replace(/^\/article/, '/'), // ·����д
                changeOrigin: true
            }
        },
    },
    resolve: {
        alias: {
            '@': fileURLToPath(new URL('./src', import.meta.url))
        }
    }
})
