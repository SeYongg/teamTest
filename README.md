#에어비엔비 클론코딩 토이 프로젝트

## Project Information

- node version : 14.15.4
- vue-cli version : 4.5.15
  ```
  npm install @vue/cli -g
  ```

## Usage

```

```

## Project Setting Process

```

### vue create front-home
> Manually select features
> Choose Vue version / Babel & Linter / Formatter
> 2.x
> ESLint + Prettier
> Lint on save
> In dedicated config files
> N

### vuex 등록
 : vue add vuex

### vue-router 등록
 : vue add router
 > N

```
### 메인 의존성 설치
```
npm i --save dayjs js-cookie axios nprogress
```

### 개발 의존성 설치
```
npm i --save-dev node-sass@4.14.1 sass-loader@7.3.1
```

### Prettier
```
### .prettierrc.js 추가 (파일 참고)
### vue-cli를 통해 package.json에 devDependencies에 추가되어있음 (추가되어있지 않으면 추가해야함)

### prettier 인텔리제이 설정
  * prettier plugins 설치
  * 플러그인 설정 변경 
     Preferences > Languages & Frameworks > JavaScript > Prettier 
     경로 /node_modules/prettier 로 변경 & On save 체크
```

### ESLint
```
### .eslintrc.js 수정 (파일 참고)
### vue-cli를 통해 package.json에 devDependencies에 추가되어있음 (추가되어있지 않으면 추가해야함)

### eslint 인텔리제이 설정
  * 플러그인 설정 변경
     Preferences > Languages & Frameworks > JavaScript > Code Quality Tools 에서 Automatic ESLint configuration 클릭 & Run eslint —fix on save 체크

```
