<template>
  <ul id="array-rendering">
    <li v-for="(film, index) in films" :key="index" :film="film">
      {{ film.title + " : " + film.author}}
    </li>
  </ul>
</template>

<script>
export default {
  props: {
    films: {
      type: Array,
      required: true,
    },
  }
}
</script>

<style scoped>
a {
  color: #42b983;
}
</style>
