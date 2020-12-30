function() {
   var System = Java.type('java.lang.System');
     // base config
var config = {
// for demo I've used a demo rest API with fake data from https://reqres.in/api/users
    sampleTestUrl: 'https://reqres.in/api/users?page=2'
  };

  karate.configure('connectTimeout', 5000);
  karate.configure('readTimeout', 5000);
  return config;
}
