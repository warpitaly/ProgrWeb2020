// Your web app's Firebase configuration
var firebaseConfig = {
  apiKey: "AIzaSyBUNnrBAK6q0Vo3yCo5LgpGfK8sQWIKaic",
  authDomain: "progrweb2020.firebaseapp.com",
  databaseURL: "https://progrweb2020.firebaseio.com",
  projectId: "progrweb2020",
  storageBucket: "progrweb2020.appspot.com",
  messagingSenderId: "457983824666",
  appId: "1:457983824666:web:fdc8e1320e9b9dbf72d2a3"
};

// Initialize Firebase
firebase.initializeApp(firebaseConfig);

var ui = new firebaseui.auth.AuthUI(firebase.auth());

ui.start("#firebaseui-auth-container", {
  signInOptions: [
    firebase.auth.EmailAuthProvider.PROVIDER_ID,
    firebase.auth.GoogleAuthProvider.PROVIDER_ID
  ],
  signInSuccessUrl: "index.jsp",
  signInFlow: 'popup',
  callbacks: {
    uiShown: function () {
      $("#loader").hide();
    },
    signInSuccessWithAuthResult: function (authResult, redirectUrl) {
      var name = authResult.user.displayName;
      var email = authResult.user.email;
      $("#userData").html("nome: " + name + " - email: " + email);
      authResult.user.getIdToken().then(data => {
        console.log(data);
        $.ajaxSetup({
          headers: {
            "Authorization": "Bearer " & data
          }
        });
        document.cookie = "bearer="+data;
      });


    }
  }
});