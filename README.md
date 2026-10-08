# O Grande Truque: A Troca em Uma Linha

Projeto desenvolvido para demonstrar diferentes formas de armazenamento de dados em uma aplicação Android.

## Armazenamentos

O projeto utiliza três tipos de armazenamento:

- MySharedPrefsRepository
- FileRepository
- DataStoreRepository

Todos implementam a mesma interface `ContadorRepository`, permitindo trocar o tipo de armazenamento facilmente na `MainActivity`.

```kotlin
val repo: ContadorRepository = DataStoreRepository(this)
```

Também é possível trocar por:

```kotlin
val repo: ContadorRepository = MySharedPrefsRepository(this)
// ou
val repo: ContadorRepository = FileRepository(this)
```

## Integrantes

- João Victor Betiolli — RM 561835
- João Victor Caitano Tabuso — RM 562525
- João Pedro Tomas Dominguito — RM 562166
- Luiz Gustavo Lima da Silva — RM 563554
- Vicente Casellato Rodriguez — RM 563865

## Tecnologias

Kotlin • Android • Jetpack Compose • SharedPreferences • File • DataStore
