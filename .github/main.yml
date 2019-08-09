name: Demo Github CI-CD
on:
  push:
    branches:
      - master
jobs:
  build:
    name: Build App
    runs-on: ubuntu-18.04
    steps:
      - uses: actions/checkout@master
      - name: Hello There
        run: echo Hello there ${FIRST_NAME} ${LAST_NAME}
        env:
          first_name: Nitin
          last_name: Bansal
