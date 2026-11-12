# Avito Patches

Morphe patches for the Avito Morocco app (`se.scmv.morocco`).

## ❓ About

Removes the in-house sponsored banner pinned to the top of the Avito home screen.

<!-- TODO: Update this about section with a brief introduction/summary about this repo and what it offers. -->

### How to use these patches

Click the button below, or manually add this repo url to Morphe Manager: https://github.com/Nizarberyan/Avito-Patches

<a href="https://morphe.software/add-source?github=Nizarberyan/Avito-Patches">
  <img src=".github/assets/add-to-morphe.svg" alt="Add to Morphe" height="48">
</a>

## 🩹 Patches list

<!-- PATCHES_START EXPANDED -->
> **[v1.0.0](https://github.com/Nizarberyan/Avito-Patches/releases/tag/v1.0.0)**&nbsp;&nbsp;•&nbsp;&nbsp;`main`&nbsp;&nbsp;•&nbsp;&nbsp;1 patches total
<details open>
<summary>📦 Avito&nbsp;&nbsp;•&nbsp;&nbsp;1 patch</summary>
<br>

**Package name:** `se.scmv.morocco`

**🎯 Supported versions:**

| 10.8.1 |
| :---: |

| 💊&nbsp;Patch | 📜&nbsp;Description | ⚙️&nbsp;Options |
|----------|----------------|-----------|
| [Hide sticky banner](#hide-sticky-banner) | Removes the sponsored campaign banner pinned above the search bar on the home screen. |  |

</details>

<!-- PATCHES_END -->

### 🛠️ Building locally

- Run `./gradlew buildAndroid`
- The built patches .mpp file is found in `patches/build/libs/patches-*.mpp`
- Patch the mpp file using [Morphe-Desktop](https://github.com/MorpheApp/morphe-desktop)
  like any other patch bundle.

See the [Morphe documentation](https://github.com/MorpheApp/morphe-documentation) for more information.

## 📜 License

These patches are licensed under the [GNU General Public License v3.0](LICENSE)
