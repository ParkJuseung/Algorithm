function solution(n) {
    if(n % 7 === 0) {
        return n / 7
    }
    else {
        let answer = parseInt(n / 7);
        return answer + 1;
    }

}