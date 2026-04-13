# Project9_4 - 실습 9-1 간단 그림판 앱

## 구현 내용
- 옵션 메뉴 제공: `선 추가`, `원 추가`, `사각형 추가`
- `Shape` 부모 클래스를 상속한 `Line`, `Circle`, `Rect` 구현
- 도형 객체를 `List<Shape>`로 관리
- 터치 이벤트에서 `MotionEvent.ACTION_UP` 발생 시 선택된 도형 객체를 리스트에 추가
- `onDraw` 이벤트에서 리스트의 모든 도형 객체를 캔버스에 다시 그림

## 주요 파일
- `app/src/main/java/com/cookandroid/project9_4/Shape.java`
- `app/src/main/java/com/cookandroid/project9_4/Line.java`
- `app/src/main/java/com/cookandroid/project9_4/Circle.java`
- `app/src/main/java/com/cookandroid/project9_4/Rect.java`
- `app/src/main/java/com/cookandroid/project9_4/MyGraphicView.java`
- `app/src/main/java/com/cookandroid/project9_4/MainActivity.java`
- `app/src/main/res/menu/shape_menu.xml`

## 실행 결과 캡처
- `screenshots/execution_result.png`
