
<img width="1200"  alt="image" src="https://github.com/rlagydms2/anbd/assets/151723087/97c5278a-bd23-44c0-81b6-6a1051561c49">

<img width="1200" alt="image" src="https://github.com/rlagydms2/anbd/assets/151723087/10b1f42a-9d86-420f-ba3a-e518d1a279e2">

## **프로젝트 발표 영상**

#### | YuTube URL | <br/>
https://www.youtube.com/watch?v=54-fBDTxFR8&list=PLedGoSru794_gV9NDzrzhk2PsJGThG23p

# ♻️ **ANBD 소개**

### ‘아’껴쓰고 ‘나’눠쓰고 ‘바’꿔쓰고 ‘다’시쓰자

### 추억의 아나바다 운동!

이 프로젝트의 목표는 사용하지 않는 물건이 다른 사람에게는 필요할 수 있음을 사용자가 인식하고,
물건의 가치를 재발견하며 새로운 소비 패턴을 형성하는 것입니다.  

더 나아가 추억의 아나바다 운동을 MZ세대에 알리고 사용자들에게 물건을 재활용하고 다시 활용함으로써 환경 보호에 기여한다는 성취감까지 제공하고자 합니다.

## 😀 **팀원 소개**

| 팀원  | 링크 | 역할                         |
|-----|--|----------------------------|
| 김효은 | 깃허브 | 프론트엔드 총괄                   |
|     |  | 반응형 웹 UI 구현                |
|     |  | 홈페이지 전체 디자인 구현             |
| 이종현 | 깃허브 | 웹소켓을 이용한 채팅방 구현            |
|     |  | 마이페이지, 관리자페이지 구현           |
| 장고운 | 깃허브 | JWT 로그인 구현                 |
|  |  | Redis를 이용한 로그아웃, 이메일 인증 구현 |
| 권희수 | 깃허브 | 상품 CRUD 구현                 |
|  |  | 구글맵API를 이용한 거래장소 구현         |

## 🛠 **기술 스텍**
<img width="844" alt="image" src="https://github.com/leejonghyeon99/anbd/assets/151723087/4d2b7ec2-bb37-4940-9cf0-1b755865bff0">

## 📆 **개발 기간**

**2024.02.14 ~ 2024.03.20 (총 6주)**

| 주차  |   구분    | 활동                 |
|:---:|:-------:|:-------------------|
| 1주차 |  사전기획   | 프로젝트 주제 선정 및 기획안 작성 | 
| 2주차 | 데이터 전처리  |    데이터 정제 및 정규화 |
| 3주차  |   모델링   | 기본  UI 설계          |  
| 4주차| 서비스 구축  | 웹 서비스 시스템 설계       | 
| 5주차 | 서비스 구축  | 최적화, 오류수정          |  


## 🔄 **시스템 설계**
![](readme/systemArchitecture.png)

1. 클라이언트 요청: 사용자가 리액트 기반의 웹 애플리케이션에서 어떤 동작(예: 데이터 조회, 데이터 입력)을 요청하면, 리액트 앱은 해당 요청에 해당하는 HTTP 요청을 서버의 API 엔드포인트로 보냅니다.  

2. 서버 처리: 자바 스프링 부트 서버가 클라이언트로부터의 API 요청을 받으면, 스프링 데이터 JPA를 통해 데이터베이스에 접근하여 요청된 작업(데이터 조회, 수정, 삭제 등)을 수행합니다.  
처리 결과를 받아서 서버는 그 결과를 다시 클라이언트에 JSON 형태로 응답합니다.

3. 클라이언트 응답 처리: 리액트 앱은 서버로부터의 응답 데이터를 받아 사용자 인터페이스에 반영합니다. 이를 통해 사용자는 최신 데이터를 볼 수 있게 됩니다.

## **서비스 기능 소개**

### 독립적 컴포넌트

<img width="544" alt="image" src="https://github.com/rlagydms2/anbd/assets/151723087/fa125bf7-4a6e-4ae1-b163-83c9168859f4"><br/><br/>
✔️ Header / Sidebar / content 컴포넌트가 각각 독립적으로 동작 <br/><br/>
<img width="564" alt="image" src="https://github.com/rlagydms2/anbd/assets/151723087/f06128f9-7c01-48ed-98ec-c7e44de8c93d"><br/><br/>
✔️ 변경된 URL에 따라 content 컴포넌트만 동작<br/><br/>
▶ ** 시연 영상 **<br/>
![GOMCAM20240325_1508240137-ezgif com-resize](https://github.com/leejonghyeon99/anbd/assets/151723087/10302aaa-1018-4b71-a358-73f70dd70e84)
<br/>

### 권한별 페이지 렌더링
✔️ 권한 : 비회원, 회원, 관리자<br/><br/>

✔️ 권한에 따라 회원과 관리자의 mypagebar가 다르게 렌더링되며 비회원은 회원아이콘과 mypagebar가 제공되지 않습니다.<br/><br/>
<img width="796" alt="image" src="https://github.com/rlagydms2/anbd/assets/151723087/02a93742-bff6-4b53-a1ff-3256ffae4c79"><br/><br/>
✔️ 권한에 따라 비회원은 아래와 같은 상품에 대한 서비스 이용이 제한되어있습니다.<br/><br/>
** 회원의 경우<br/><br/>
✔️ 상품등록버튼 有, 회원 아이콘 有<br/><br/>
<img width="832" alt="image" src="https://github.com/rlagydms2/anbd/assets/151723087/e84054b1-c2ea-4fac-9b33-8c82400df9e8"><br/><br/>
✔️ 타인 게시물 채팅아이콘 有, 내 게시물 수정, 삭제버튼 有 <br/><br/>
<img width="812" alt="image" src="https://github.com/rlagydms2/anbd/assets/151723087/824bd4c2-52d3-4dc7-8fe9-17203b4dcd33"><br/><hr/>
** 비회원의 경우<br/><br/>
✔️ 상품등록버튼 無, 회원 아이콘 대신 로그인, 회원가입 버튼 有<br/><br/>
<img width="833" alt="image" src="https://github.com/rlagydms2/anbd/assets/151723087/dfbc2848-fd2a-4fa6-aab4-c4ede9ecdd97"><br/><br/>
✔️ 채팅 또는 수정, 삭제 버튼 無<br/><br/>
<img width="846" alt="image" src="https://github.com/rlagydms2/anbd/assets/151723087/0a31c576-3c50-4539-b72a-e5b54354461e">






### 회원가입 validation

<img width="758" alt="image" src="https://github.com/rlagydms2/anbd/assets/151723087/10bbf963-d873-4bd4-b394-a9afc51495b7"><br/><br/>
<p>&ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; 
  &ensp; &ensp;⬇️<br/></p>
<img width="758" alt="image" src="https://github.com/rlagydms2/anbd/assets/151723087/69f3e2fc-deb8-4a43-a422-4b35e8d52c43"><br/>
✔️ 필수 입력사항 미입력시 경고문이 나타납니다.<br/><br/>

✔️ -이메일 미기입 유효성검사<br/>
<br/>
![ezgif com-resize](https://github.com/leejonghyeon99/anbd/assets/151723087/21329e46-991b-4a11-9f86-a34170f7c1ec)<br/><br/>
✔️ -그 외 회원가입 정보 미기입 유효성검사<br/>
![ezgif com-resize (1)](https://github.com/leejonghyeon99/anbd/assets/151723087/57a08ec4-59c5-4e46-94f7-46fb8d31ff03)<br/><br/>
<br/>

### 로그인
<img width="1153" alt="image" src="https://github.com/rlagydms2/anbd/assets/151723087/00824b2b-df8c-4548-8880-d1874aa8e70e"><br/><br/>

### 상품 등록 페이지
<img width="1155" alt="image" src="https://github.com/rlagydms2/anbd/assets/151723087/05ef439b-7586-476a-a378-1476e0f1ce84"><br/><br/>


### 상품목록 필터링

✔️ 상품 상태를 필터링해주는 select와 검색창이 있습니다.<br/>
<img width="790" alt="image" src="https://github.com/rlagydms2/anbd/assets/151723087/451f3ba2-6ea5-4144-8865-d03c73bed59a"> <br/><br/>
✔️ 상품 상태만을 필터링해보겠습니다.<br/><br/>
<img width="790" alt="image" src="https://github.com/rlagydms2/anbd/assets/151723087/87f5ab34-f05a-4ed4-998e-bdeb40361aaa"><br/><br/>
✔️ 필터링된 목록에서 검색을 해보겠습니다.<br/><br/>
<img width="754" alt="image" src="https://github.com/rlagydms2/anbd/assets/151723087/72bf3423-0ab2-4472-9cbc-fcfa4a9167ec"><br/><br/>
▶ ** 시연 영상 **<br/>
![GOMCAM20240325_1154570201-ezgif com-resize](https://github.com/leejonghyeon99/anbd/assets/151723087/08666f0b-dc4e-4876-8a68-30c23f361492)


### 채팅방
<br/> ✔️ 원하는 상품의 구매자에게 채팅을 보낼 수 있습니다.<br/><br/>
![GOMCAM20240325_1210320828-ezgif com-resize](https://github.com/leejonghyeon99/anbd/assets/151723087/7ae22c57-ef23-4a32-b237-71d93d9d3d18)<br/><br/>
✔️ 구매하고자 했던 목록의 채팅을 보기 위해선 아래와 같이 마이페이지 바를 통해 채팅목록으로 이동할 수 있습니다.<br/><br/>
<img width="814" alt="image" src="https://github.com/rlagydms2/anbd/assets/151723087/30bf452e-a877-4105-b3f0-a066a64fcddd"><br/><hr/>
<img width="814" alt="image" src="https://github.com/rlagydms2/anbd/assets/151723087/d4717939-55c5-4542-97cc-6786ea162c07"><br/><br/>
▶ 판매자 화면<br/><br/>
![GOMCAM20240325_1216170030-ezgif com-resize](https://github.com/leejonghyeon99/anbd/assets/151723087/c2a80940-7f42-442b-84c5-7aa715bc4ed1)
![GOMCAM 20240325_1217570060](https://github.com/leejonghyeon99/anbd/assets/151723087/2ca583df-734b-49ba-80b3-87c0dbb7b73e)<br/><br/>
▶ 채팅 영상 왼쪽-판매자, 오른쪽-구매자<br/><br/>
 ![GOMCAM20240325_1226440531-ezgif com-resize](https://github.com/leejonghyeon99/anbd/assets/151723087/2c38125c-146f-4a3b-b00c-d600d6b548d8)<br/>


### 반응형 웹

✔️ 모바일에서도 사용가능하도록 반응형 웹을 구현하였습니다.<br/><br/>
<img width="800" alt="image" src="https://github.com/rlagydms2/anbd/assets/151723087/59ab0933-71fa-451b-8b42-10a02e09d38a">
