------------------------------------------------------------------
1. Basic Routing
------------------------------------------------------------------

use Illuminate\Support\Facades\Route;

Route::get('/greeting', function () {
    return 'Hello World';
});
------------------------------------------------------------------

[All Laravel routes are defined 'routes/web.php' directory. These files are automatically loaded by your application's 'App\Providers\RouteServiceProvider'
use App\Http\Controllers\UserController;

Route::get('/user', [UserController::class, 'index']);
------------------------------------------------------------------

[Available Router Methods]
Route::get($uri, $callback);
Route::post($uri, $callback);
Route::put($uri, $callback);
Route::patch($uri, $callback);
Route::delete($uri, $callback);
Route::options($uri, $callback);

------------------------------------------------------------------

[ Sometimes you may need to register a route that responds to multiple HTTP verbs. You may do so using the match method ]
Route::match(['get', 'post'], '/', function () {
    //
});

[you may even register a route that responds to all HTTP verbs using the any method]
Route::any('/', function () {
    //
});

------------------------------------------------------------------

use Illuminate\Http\Request;

Route::get('/users', function (Request $request) {
    // ...
})
------------------------------------------------------------------

<form method="POST" action="/profile">
    @csrf
    ...
</form>
------------------------------------------------------------------

Route::redirect('/here', '/there');
oute::redirect('/here', '/there', 301);
Route::permanentRedirect('/here', '/there');
------------------------------------------------------------------

Route::view('/welcome', 'welcome');

Route::view('/welcome', 'welcome', ['name' => 'Taylor']);



------------------------------------------------------------------
2. Route Parameters
------------------------------------------------------------------

Required Parameters

Route::get('/user/{id}', function ($id) {
    return 'User '.$id;
});
Route::get('/posts/{post}/comments/{comment}', function ($postId, $commentId) {
    //
});
------------------------------------------------------------------
------------------------------------------------------------------
------------------------------------------------------------------
------------------------------------------------------------------
