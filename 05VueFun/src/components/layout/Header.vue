<template>
  <header>
    <h1><slot>App Senza Nome</slot></h1>
  </header>
</template>

<script>
export default {
  name: "Header",
};
</script>

<style>
header {
  background: #333;
  color: #fff;
  text-align: center;
  padding: 10px;
}

header a {
  color: #fff;
  padding-right: 5px;
  text-decoration: none;
}
</style>
