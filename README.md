## 객체지향 패러다임

### 객체지향이란?
> - 적절한 객체에게 적절한 책임을 할당하여 서로 메시지를 주고 받으며, 협력하도록 하는 것
> - 점점 증가하는 `SW` 복잡도를 낮추기 위해 객체지향 패러다임 대두
> - 높은 응집도와 낮은 결합도 (High cohesion, Loose coupling`)
> - 개인적으로 생각하는 두 가지 중요 포인트
>   - 클래스가 아닌 객체에 초점을 맞추는 것
>   - 객체들에게 얼마나 적절한 역할과 책임을 할당하는지
<hr>

### 개념정리
> 객체지향 4가지 특징
> 1. 추상화 (`Abstraction`)
> 2. 다형성 (`Polymorphism`)
> 3. 캡슐화 (`Encapsulation`)
> 4. 상속 (`Inheritance`)
> 
> 객체지향의 5가지 설계 원칙 (`SOLID`)
> 1. `SRP` : `Single Responsibility Principle` (단일 책임의 원칙)
> 2. `OCP` : `Open/Closed Principle` (개방 폐쇄의 원칙)
> 3. `LSP` : `Liskov's Substitution Principle` (리스코프 치환의 원칙)
> 4. `ISP` : `Interface Segregation Principle` (인터페이스 분리의 원칙)
> 5. `DIP` : `Dependency Inversion Principle` (의존성 역전의 원칙)
> 
> 절차지향 프로그래밍 VS 객체지향 프로그래밍
> - 책임이 한 곳에 집중되어 있는 방식 (절차지향)
> - 책임이 여러 객체로 적절히 분산되어 있는 방식 (객체지향)
<hr>

### 객체지향 설계 및 구현
> 1. 도메인을 구성하는 객체에는 어떤 것들이 있는지 고민
> 2. 객체들 간의 관계를 고민
> 3. 동적인 객체를 정적인 타입으로 추상화해서 도메인 모델링 하기
> 4. 협력을 설계
> 5. 객체들을 포괄하는 타입에 적절한 책임을 할당
> 6. 구현하기
> 
> 참고
> - 객체지향 세계에서는 모든 객체가 능동적인 존재