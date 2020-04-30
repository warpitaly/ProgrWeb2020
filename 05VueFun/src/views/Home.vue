<template>
  <div id="app">
    
    <AddTodo @add-todo="addTodo"/>
    <Todos v-bind:todos="todos" @del-todo="deleteTodo" />
  </div>
</template>

<script>

import AddTodo from "../components/AddTodo";
import Todos from "../components/Todos";
import axios from "axios";

export default {
  name: "App",
  components: {
    AddTodo,
    Todos,
  },
  data() {
    return {
      msg: "Ciao, mondo!!",
      todos: [ ],
    };
  },
  methods: {
    deleteTodo(id) {
      axios.delete(`${process.env.VUE_APP_APIROOT}/todos/${id}`)
        .then(this.todos = this.todos.filter((todo) => todo.id !== id))
        .catch(err => console.log(err))
      
    },
    addTodo(newTodo){
      const {title, completed} = newTodo;
      axios.post(`${process.env.VUE_APP_APIROOT}/todos`,{
         title,
         completed
      })
       .then(res => this.todos.push(res.data))
       .catch(err => console.log(err))
      
     
    }
  },
  created(){
    axios.get(`${process.env.VUE_APP_APIROOT}/todos`)
      .then(res => this.todos = res.data)
      .catch(err => console.log(err));

    console.log(process.env.VUE_APP_CHIAVE);
    console.log(process.env.VUE_APP_APIROOT);
  }
};
</script>

<style>
* {
  box-sizing: border-box;
  margin: 0;
  padding: 0;
}
body {
  font-family: Arial, Helvetica, sans-serif;
  line-height: 1.4;
}

.btn {
  display: inline-block;
  border: none;
  background: #555;
  color: #fff;
  padding: 7px 20px;
  cursor: pointer;
}
.btn:hover {
  background: #666;
}
</style>

