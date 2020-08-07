# DataStructure

자료구조 공부하는 Repository

## Todo List

1. 선형구조

- [ ] ArrayList
- [ ] LinkedList
  - [ ] 단순
  - [ ] 이중
  - [ ] 원형
- [ ] Stack
- [ ] Queue
- [ ] Dequeue

2. 비선형 구조

- [ ] 트리
  - [ ] 일반
  - [ ] 이진
- [ ] 그래프
  - [ ] 방향
  - [ ] 무방향

3. 기타 구조

- [ ] Trie
- [ ] HashTable

## Merge 하는 방법

- Pull Request를 통해 코드리뷰를 진행 후에 master branch에 Merge 가능
- 상세 Merge flow

  1. Branch 따기

     - master를 기점으로 시작.
     - 구현시 개인 branch를 따서 시작
     - Branch의 Convention은 ArrayList-SH 같은 형식으로 "(구현구조명)-(이름이니셜)"의 형식

  2. Commit하기
     - Commit의 단위
       1. 특정한 큰 기능이 에러가 나지 않게 구현된 경우
       2. 버그 fix나 오탈자를 수정한 경우
       3. 변수 리팩토링을 한 경우
     - Commit 메시지 Convention(추후 commit.template로 관리 예정)
     - <타입> : <Commit메시지>의 형식으로 작성.
     - <타입>
       - feat : 기능 (새로운 기능)
       - fix : 버그 (버그 수정)
       - refactor : 리팩토링
       - style : 스타일 (코드 형식, 세미콜론 추가 : 비즈니스 로직에 변경 없음)
       - docs : 문서 (문서 추가, 수정, 삭제)
       - test : 테스트 (테스트 코드 추가, 수정, 삭제 : 비즈니스 로직에 변경 없음 )
       - chore : 기타 변경사항 (빌드 스크립트 수정 등)
     - <Commit메시지>
       - 영어를 사용하는 경우
         - 메시지의 첫글자는 대문자
         - 명령문으로 작성
       - 한글을 사용하는 경우
         - 서술형 종결어미 금지(-한다, -함)
         - 명사로 종결 (~ 구현, ~ 작성)
       - 한/영 공통
         - 메시지 끝에 마침표(.) 금지
     - reference : <https://junwoo45.github.io/2020-02-06-commit_template/>
  3. Origin branch에 Push 및 최신 master branch 반영
     - 수정된 코드가 겹치는 경우 Confilct 가능성
     - master branch에서 pull
     - master -> 개인 branch로 merge
     - Confilct시 해결
  4. Github에서 개인 branch Pull Request 요청
     - 제목과 본문을 간략하게 명시
     - 모든 contributer를 오른쪽 메뉴의 Reviewer로 세팅
     - Code Review 진행
       - 로직, 변수명 등 모든 내용에 대한 코드 리뷰
       - 자세한 내용은 추후 작성
     - 모든 인원이 approve시에 merge.
     - merge 권한에 대해서는 추후 제어

- 모든 규칙은 구성원들의 협의에 따라 변경이 가능하다. 협의가 변경된 내용들은 변경일자, 변경내용, 작성자를 별도의 문서에 기입한다.
