<template>
  <el-main>
    <el-form :inline="true" :model="formInline" class="demo-form-inline">
      <el-form-item label="用户民">
        <el-input v-model="formInline.loginName" placeholder="用户名"></el-input>
      </el-form-item>
      <el-form-item label="密码">
        <el-input v-model="formInline.loginPass" placeholder="密码"></el-input>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="onSubmit">登录</el-button>
      </el-form-item>
    </el-form>
    <el-form :inline="true" :model="formInline" class="demo-form-inline">
      <el-form-item label="用户民">
        <el-input v-model="formInline.registerName" placeholder="用户名"></el-input>
      </el-form-item>
      <el-form-item label="密码">
        <el-input v-model="formInline.registerPass" placeholder="密码"></el-input>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="onSubmit">注册</el-button>
      </el-form-item>
    </el-form>
  </el-main>
</template>

<script>
  const axios = require("axios")
  export default {
    name: 'HelloWorld',
    data() {
      return {
        formInline: {}
      }
    },
    methods: {
      onSubmit() {
        this.$message("登录成功")
        // axios({
        //   url:"http://localhost:8082/user/loginORregister",
        //   method: "post",
        //   data: this.formInline
        // }).then(function (response) {
        //     console,log(response)
        // })

      }
    }
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  h1, h2 {
    font-weight: normal;
  }

  ul {
    list-style-type: none;
    padding: 0;
  }

  li {
    display: inline-block;
    margin: 0 10px;
  }

  a {
    color: #42b983;
  }
</style>
