/**
 * @return {Generator<number>}
 */
var fibGenerator = function*() {
    let arr=[];
    arr.push(0);
    for(let i=1;i<=50;i++){
        if(arr.length === 1) arr.push(i);
            arr.push(arr[i-1] + arr[i]);
    }
    let c=0;
    while(true){
        yield arr[c++];
    }
}

/**
 * const gen = fibGenerator();
 * gen.next().value; // 0
 * gen.next().value; // 1
 */