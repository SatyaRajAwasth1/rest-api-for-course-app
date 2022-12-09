// JS file to fetch API's
fetch("http://127.0.0.1:8081/courses")
    .then(response=>{
        return response.json();
    }).then(json=>{
    console.log(json);
})

// // it doen't work
//         const requestCourse = new XMLHttpRequest(); // created a new request
//         requestCourse.open("GET","http://127.0.0.1:8080/courses") //opening the request
//         requestCourse.send(); // sending the request

//         requestCourse.onload = () => { // onloading the response of request
//             if(requestCourse.status === 200){ // we get courses only if status code is ok (200)
//                 console.log(JSON.parse(requestCourse.responses));
//             }
//             else { // else printing the error status
//                 console.log("Error "+requestCourse.status)
//             }
//         }
