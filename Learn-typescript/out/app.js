// //Lab1
// let str1:string = "abac"
// console.log(str1.length)        //1
// console.log(str1.charAt(1))     //2
// console.log(str1[1])            //3
// console.log(str1.charAt(100))   //4
// console.log(str1[100])
// let strA: string = 'Hello'
// let strB: string = 'World'
// console.log(strA + "" + strB)   //5
// //Lab2
// let strEx:string = `microsoft Excel`
// console.log(strEx.toUpperCase()) //1
// let strEx2:string = `GOOGLE AND APPLE`
// console.log(strEx.toLowerCase()) //2
// let strEx3:string = `hello world`
// let strEx4:string = strEx3[0].toUpperCase() + strEx3.substring(1,6) + strEx3[6].toUpperCase() + strEx3.substring(7, 11)
// console.log(strEx4) //3
// //Lab 3
// let strL3:string = 'Hello World' //3.1
// console.log(strL3.startsWith('Hello') +  " // " strL3.strtsWith ('World'))
// console.log(strL3.endsWith('Hello') + " // " strL3.endsWith('world'))
//Dec 9
// let num = 100;
// console.log(num.toString(8))
// num = 111
// console.log(num.toString(8))
// num = 55
// console.log(num.toString(8))
// num = 21
// console.log(num.toString(8))
// num = 99
// console.log(num.toString(8))
// num = 100
// console.log(num.toString(16))
// num = 111
// console.log(num.toString(16))
// num = 55
// console.log(num.toString(16))
// num = 21
// console.log(num.toString(16))
// num = 99
// console.log(num.toString(16))
//Round Lab
//console.log(Math.round(12.423))
//console.log(Math.round(31313.135))
//console.log(Math.round(42.809))
// // random Lab
// function random(min, max) {
//     let n = Math.random()
//     return (n * (max-min)) + min
// }
// console.log(random(5,8))
// //Boolean
// let A = false, B = true, C = false
// console.log(A || (B && C)) //or , and
// console.log(B || (A && C))
// console.log(B && (A || C))
// //typeof 
// console.log(typeof(false))
// console.log(typeof("ABD"))
// console.log(typeof(113113))
// console.log(typeof(null))
// console.log(typeof(""))
var student = {
    name: "Pairt",
    age: 23,
    Gender: "Male",
    SciMath: false,
    friends: { name: "JJ", age: 23 }
};
console.log("--------------------------------------");
var student2 = {};
for (var key in student) {
    student2[key] = student[key];
}
console.log("--------------------------------------");
student2["Gender"] = null;
for (var key in student2) {
    console.log(key + ":" + student2[key]);
}
console.log("--------------------------------------");
student["MatArt"] = true;
for (var key in student) {
    console.log(key + ":" + student[key]);
}
console.log("--------------------------------------");
delete student["MatArt"];
for (var key in student) {
    console.log(key + ":" + student[key]);
}
//# sourceMappingURL=app.js.map