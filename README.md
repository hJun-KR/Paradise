# Paradise

## 프로젝트 개요

Paradise는 단순한 콘솔 게임을 넘어,
플레이어의 선택과 상태 변화에 따라 스토리가 분기되는 구조를 가진 RPG입니다.

전투, 자원 관리, 선택 기반 분기를 중심으로 설계되었으며
객체지향 구조를 기반으로 각 기능이 모듈화되어 있습니다.

---

## 기술 스택

* Java
* JSON
* Console 기반 ASCII UI
* OOP

---

## 실행 방법

### 1. 저장소 클론

``` bash
git clone <repository-url>
cd <project-folder>
```

### 2. 컴파일

``` bash
javac -cp "lib/*" src/Main.java
```

### 3. 실행
``` bash
java -cp "lib/*:src" Main
```

Windows의 경우:
``` bash
java -cp "lib/*;src" Main
```

---

## 프로젝트 구조

src/

* Main.java: 게임 실행 진입점
* sceen/: 게임 화면 및 흐름 제어
* setting/: 플레이어, 인벤토리, 시스템 설정 관리
* Zombie/: 좀비 클래스 정의
* Shop/: 상점 기능 구현
* SaveLoad/: JSON 기반 저장 및 불러오기
* ending/: 엔딩 분기 처리
* choice/: 선택지 로직 처리

Art/

* ASCII 아트 및 텍스트 리소스

DB/

* 플레이어 및 인벤토리 데이터 저장 (JSON)

lib/

* 외부 라이브러리 (GSON 등)

---

## 주요 기능

### 플레이어 시스템

* 체력(HP) 및 최대 체력 관리
* 돈(Money)을 통한 아이템 구매 및 강화
* 공격력(Damage)을 통한 전투 수행
* 감염률(Infectiousness) 시스템
* 지지율(Rating)에 따른 스토리 변화
* 좀비 처치 수(Kill Count) 기록

---

### 인벤토리 및 아이템

* 포션을 통한 체력 회복
* 백신을 통한 감염률 감소
* 다양한 무기 구매 및 장착
* 인벤토리 기반 자원 관리 시스템

---

### 탐험 및 전투

* 한국 주요 도시 기반 탐험
* 이벤트 및 선택지 기반 진행
* 다양한 좀비 유형과 전투 시스템

---

### 엔딩 시스템

플레이어의 선택과 상태에 따라 다양한 엔딩이 결정됩니다.

* Anarchy
* Capitalism
* Democracy
* Dictatorship
* Infecte
* Military Regime
* Sacrifice

---

## 주요 특징

* 선택 기반 스토리 분기 구조
* 콘솔 환경에서 구현된 ASCII 기반 UI
* JSON을 활용한 데이터 저장 시스템
* 객체지향 설계를 통한 확장 가능한 구조