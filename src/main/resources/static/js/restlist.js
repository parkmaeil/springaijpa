 async function loadBookList(){
   console.log("OK");
   // 1. fetch().then().then().catch()
   // 2. async/await
   // const response(응답)=요청;
   const response=await fetch("http://localhost:8081/api/book");
   if(!response.ok){
      throw new Error("error");
   }
   const books=await response.json();
   console.log(books); // [{  [,,]},{  [,,,]},{   ,[]}]
   let html="";
   books.forEach(book=>{
     html+="<tr>";
     html+="<td>1</td>";
     html+="<td>1</td>";
     html+="<td>1</td>";
     html+="<td>1</td>";
     html+="<td>1</td>";
     html+="</tr>";
   });
   document.getElementById("list").innerHTML=html; // ?
}