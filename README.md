# 볼링 게임 점수판
## 진행 방법
* 볼링 게임 점수판 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 구현 기능 목록
* 입력 제약 사항
    * 점수가 0 ~ 10 이외의 숫자인 경우 예외 처리가 발생한다.  
    * 첫 번째 투구와 투 번째 투구의 합이 10을 초과하면 예외처리가 발생한다.
* 볼링 게임은 총 10프레임으로 진행된다.
    * 각 프레임은 두 번의 기회가 주어진다.
    * 10 프레임은 스트라이크, 스페어의 경우 한 번의 기회가 더 주어진다.
* 각 프레임마다 결과를 출력한다.
    * 스트라이크(strike) : 프레임의 첫번째 투구에서 모든 핀(10개)을 쓰러트린 상태 
    * 스페어(spare) : 프레임의 두번재 투구에서 모든 핀(10개)을 쓰러트린 상태
    * 미스(miss) : 프레임의 두번재 투구에서도 모든 핀이 쓰러지지 않은 상태
    * 거터(gutter) : 핀을 하나도 쓰러트리지 못한 상태. 거터는 "-"로 표시
    

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)